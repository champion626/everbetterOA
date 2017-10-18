package cn.myoa.common.utils.support;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by zhangbolun on 17/10/17.
 */
public class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {
    protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @Override
    public void serialize(LocalDateTime value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
        jgen.writeString(value.format(formatter));
    }
}