INSERT INTO tb_category (name) VALUES ('Electronics');
INSERT INTO tb_category (name) VALUES ('Books');
INSERT INTO tb_category (name) VALUES ('Home Appliances');
INSERT INTO tb_category (name) VALUES ('Fashion');
INSERT INTO tb_category (name) VALUES ('Groceries');
INSERT INTO tb_category (name) VALUES ('Music');
INSERT INTO tb_category (name) VALUES ('Movies');
INSERT INTO tb_category (name) VALUES ('Sports');
INSERT INTO tb_category (name) VALUES ('Toys');
INSERT INTO tb_category (name) VALUES ('Gaming');
INSERT INTO tb_category (name) VALUES ('Health & Beauty');
INSERT INTO tb_category (name) VALUES ('Automotive');
INSERT INTO tb_category (name) VALUES ('Garden');
INSERT INTO tb_category (name) VALUES ('Office Supplies');
INSERT INTO tb_category (name) VALUES ('Pet Supplies');

INSERT INTO tb_products (name, price, description, img_url, date) VALUES ('Galactic Gadget', 1200.0, 'High-tech gadget from the future', 'https://google.com', CURRENT_TIMESTAMP)
INSERT INTO tb_products (name, price, description, img_url, date) VALUES ('Intergalactic Gizmo', 1500.0, 'Advanced gizmo from another galaxy', 'https://example.com', CURRENT_TIMESTAMP);
INSERT INTO tb_products (name, price, description, img_url, date) VALUES ('Quantum Widget', 2000.0, 'Widget powered by quantum technology', 'https://example.org', CURRENT_TIMESTAMP);
INSERT INTO tb_products (name, price, description, img_url, date) VALUES ('Cosmic Contraption', 2500.0, 'Contraption made with cosmic materials', 'https://example.net', CURRENT_TIMESTAMP);
INSERT INTO tb_products (name, price, description, img_url, date) VALUES ('Astrological Apparatus', 3000.0, 'Apparatus for astrological studies', 'https://example.edu', CURRENT_TIMESTAMP);

INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (5, 1);


