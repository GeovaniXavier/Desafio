SELECT * FROM loja.tab_produto;

USE loja;

  INSERT INTO tab_produto (id, nome, preco) VALUES
 (1, 'Placa de video', 900);
  INSERT INTO tab_produto (id, nome, preco) VALUES
 (2, 'gabinete', 400);
  INSERT INTO tab_produto (id, nome, preco) VALUES
 (3, 'teclado', 250); 
   INSERT INTO tab_produto (id, nome, preco) VALUES
 (4, 'mouse', 150); 
 
 INSERT INTO tab_inventario(id, quantidade, produto_id) VALUES
 (1, 100, 4);
  INSERT INTO tab_inventario(id, quantidade, produto_id) VALUES
 (2, 100, 3);
   INSERT INTO tab_inventario(id, quantidade, produto_id) VALUES
 (3, 100, 2);
   INSERT INTO tab_inventario(id, quantidade, produto_id) VALUES
 (4, 100, 1);
 
 INSERT INTO tab_cliente(id, cpf, email, nome) VALUES
 (1, '88888888888', 'geovani@gmail.com', 'Geovani');
 INSERT INTO tab_cliente(id, cpf, email, nome) VALUES
 (2, '99999999999', 'CristianoRonaldo@gmail.com', 'Cristiano Ronaldo');
 INSERT INTO tab_cliente(id, cpf, email, nome) VALUES
 (3, '10000000000', 'Messi@gmail.com', 'Messi');
 INSERT INTO tab_cliente(id, cpf, email, nome) VALUES
 (4, '55555555555', 'Hazard@gmail.com', 'Hazard');
 
 INSERT INTO tab_pedido(id, status, total_valor, cliente_id) VALUES 
 (1, 'Concluido', '900', 4);