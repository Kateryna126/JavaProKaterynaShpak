CREATE TABLE homework
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE lesson
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    updatedAt   TIMESTAMP    NOT NULL,
    homework_id INTEGER REFERENCES homework (id) ON DELETE CASCADE
);

CREATE TABLE schedule
(
    id        SERIAL PRIMARY KEY,
    name      VARCHAR(255) NOT NULL,
    updatedAt TIMESTAMP    NOT NULL
);

CREATE TABLE schedule_Lesson
(
    schedule_id INT,
    lesson_id   INT,
    PRIMARY KEY (schedule_id, lesson_id),
    FOREIGN KEY (schedule_id) REFERENCES Schedule (id),
    FOREIGN KEY (lesson_id) REFERENCES Lesson (id)
);