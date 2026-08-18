INSERT INTO symptom (name, description, created_by_user_id)
VALUES
    ('Вагинальная сухость', NULL, 1),
    ('Запор', NULL, 1),
    ('Диарея', NULL, 2),
    ('Тошнота', NULL, 3)
ON CONFLICT DO NOTHING;