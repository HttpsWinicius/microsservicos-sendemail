package com.ms.email.services;


import com.ms.email.enums.StatusEmail;
import com.ms.email.models.EmailModel;
import com.ms.email.repositorys.EmailRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService {


    private static  final Logger LOGGER = Logger.getLogger(EmailService.class);

    /**
     * @Autowired É para utilizar injeção de dependencia, sem precisar fazer um new;
      */
    @Autowired
    EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSeder;

    public EmailModel sendEmail(EmailModel emailModel) {


        emailModel.setSendDateEmail(LocalDateTime.now());

        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmailFrom());
            message.setTo(emailModel.getEmailTo());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            emailSeder.send(message);

            emailModel.setStatusEmail(StatusEmail.SENT);
        } catch (MailException e) {
            LOGGER.info("Failed to send email:", e);
            emailModel.setStatusEmail(StatusEmail.ERROR);
        } finally {
            return emailRepository.save(emailModel);
        }


    }
}
