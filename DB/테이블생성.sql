CREATE DATABASE todo_app;

USE todo_app;

CREATE TABLE todos (
    id INT AUTO_INCREMENT PRIMARY KEY,      -- 고유 ID
    text VARCHAR(255) NOT NULL,             -- 할 일 텍스트
    completed BOOLEAN NOT NULL DEFAULT 0,   -- 완료 여부 (기본값: false)
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  -- 생성 시각
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  -- 수정 시각
);
