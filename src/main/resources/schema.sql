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

INSERT INTO recipe (name, description, time_required, meal_type) VALUES
    ('Pancakes', 'Delicious fluffy pancakes', 30, 'breakfast'),
    ('Spaghetti Carbonara', 'Classic Italian pasta dish', 45, 'dinner');

INSERT INTO ingredient (recipe_id, name, amount) VALUES
    (1, 'Flour', '200g'),
    (1, 'Milk', '300ml'),
    (1, 'Egg', '2'),
    (1, 'Sugar', '50g'),
    (2, 'Spaghetti', '250g'),
    (2, 'Bacon', '150g'),
    (2, 'Egg', '2'),
    (2, 'Parmesan cheese', '100g');

