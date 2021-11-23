FROM python:3.7-slim
ADD app/ /app
WORKDIR /app

RUN pip3 install -r requirements.txt

EXPOSE 5000
ENTRYPOINT [ "flask"]
CMD [ "run", "--host", "0.0.0.0" ]
