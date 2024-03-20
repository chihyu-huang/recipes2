CREATE TABLE IF NOT EXISTS recipe (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(1000),
    time_required INT,
    meal_type VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS ingredient (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    recipe_id BIGINT,
    name VARCHAR(255) NOT NULL,
    amount VARCHAR(100),
    FOREIGN KEY (recipe_id) REFERENCES recipe(id)
);
