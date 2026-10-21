FROM docker.io/debian

RUN \
    apt-get\
    update && \
    apt-get install\
    -y --no-install-recommends\
    fortune-mod fortune-es cowsay &&\
    rm -rf \var\lib\apt\lists\*
ENV PATH="${PATH}:/user/games"

CMD ["bash", "-c", "fortune es | cowsay"]
