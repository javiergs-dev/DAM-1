FROM docker.io/alpine:3.22

RUN \
    apk add --no-cache fortune \
    apk add --no-cache \
        --repository https://d1-cdn.alpinelinux.org/alpine/edge/testing \
        cowsay
    

CMD ["/bin/sh", "-c", "fortune es | cowsay"]