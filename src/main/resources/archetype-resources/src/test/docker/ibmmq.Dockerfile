FROM ibmcom/mq

RUN useradd mqadmin -G mqm && \
    echo mqadmin:passw0rd | chpasswd

COPY config.mqsc /etc/mqm/