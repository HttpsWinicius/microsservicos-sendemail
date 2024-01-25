package com.ms.email.utils;

import lombok.experimental.UtilityClass;

import java.text.DateFormat;
import java.time.LocalDateTime;

@UtilityClass
public class DataFormatUtil {

    public LocalDateTime formatDate(LocalDateTime date) {

        String format = DateFormat.getDateInstance(DateFormat.FULL).format(date);
        return LocalDateTime.parse(format);

    }

}
