# Nginx의 최신 버전을 기반으로 하는 도커 이미지를 사용합니다.
FROM nginx:latest

# 현재 디렉토리의 index.html 파일을 Nginx의 기본 HTML 경로로 복사합니다.
# 즉, Nginx 서버에서 제공할 HTML 파일을 지정합니다.
COPY index.html /usr/share/nginx/html/index.html

# 도커 컨테이너가 외부와 통신할 수 있도록 80번 포트를 엽니다.
# Nginx는 기본적으로 80번 포트를 사용하여 HTTP 요청을 처리합니다.
EXPOSE 80
