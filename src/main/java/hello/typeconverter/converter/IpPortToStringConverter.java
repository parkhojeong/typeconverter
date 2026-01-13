package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {
    @Nullable
    @Override
    public String convert(IpPort source) {
        log.info("source = {}", source);
        //IpPort(ip=127.0.0.1, port=8080) -> "127.0.0.1:8080"
        return source.getIp() + ":" + source.getPort();
    }
}
