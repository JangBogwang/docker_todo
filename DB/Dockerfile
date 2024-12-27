FROM mysql:latest

# 환경 변수 설정
ENV MYSQL_ROOT_PASSWORD=ssafy
ENV MYSQL_DATABASE=todo_app

# 초기화 스크립트를 복사
COPY ./init.sql /docker-entrypoint-initdb.d/

# MySQL 기본 포트 3306 노출
EXPOSE 3306
