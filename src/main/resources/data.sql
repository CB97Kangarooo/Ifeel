INSERT INTO symptom (name, description, created_by_user_id)
VALUES
    ('Головная боль', NULL, NULL),
    ('Боль внизу живота', NULL, NULL),
    ('Боль в пояснице', NULL, NULL),
    ('Чувствительность в груди', NULL, NULL),
    ('Вздутие, газы', NULL, NULL),
    ('Отеки', NULL, NULL),
    ('Высыпания', NULL, NULL),
    ('Бессонница', NULL, NULL),
    ('Рассеянность', NULL, NULL)
ON CONFLICT DO NOTHING;