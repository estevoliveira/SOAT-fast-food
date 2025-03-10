create table tb_categoria (id bigint generated by default as identity, nome varchar(255), primary key (id));
create table tb_cliente (id bigint generated by default as identity, cpf varchar(255), email varchar(255), nome varchar(255), primary key (id));
create table tb_pedido (pagamento boolean, status smallint check (status between 0 and 3), cliente_id bigint, id bigint generated by default as identity, primary key (id));
create table tb_pedido_produto (preco float(53), qtde integer, pedido_id bigint not null, produto_id bigint not null, primary key (pedido_id, produto_id));
create table tb_produto (preco float(53), categoria_id bigint, id bigint generated by default as identity, descricao TEXT, imagem TEXT, nome varchar(255), primary key (id));
alter table if exists tb_pedido add constraint FKajo6v90obpung9h40lcain479 foreign key (cliente_id) references tb_cliente;
alter table if exists tb_pedido_produto add constraint FKc3xekt4kw8on58e9ieyqiv2ce foreign key (produto_id) references tb_produto;
alter table if exists tb_pedido_produto add constraint FKjw6uewldiincmxg0ehs09asu foreign key (pedido_id) references tb_pedido;
alter table if exists tb_produto add constraint FK1ksfe2oumgjxke3oc5op41lej foreign key (categoria_id) references tb_categoria;
insert into tb_categoria (nome) values ('Lanche');
insert into tb_categoria (nome) values ('Acompanhamento');
insert into tb_categoria (nome) values ('Bebida');
insert into tb_categoria (nome) values ('Sobremesa');
insert into tb_produto (nome,descricao,preco,imagem,categoria_id) values ('X-bacon','Um lanche com hamburguer artesanal, bacon, queijo chedar',35.50,'https://www.google.com/url?sa=i&url=https%3A%2F%2Fvocegastro.com.br%2Freceita-de-x-bacon%2F&psig=AOvVaw2UvMHr3_5igGBP1d4izob7&ust=1737246746620000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCOiBuM-C_ooDFQAAAAAdAAAAABAJ',1);
insert into tb_produto (nome,descricao,preco,imagem,categoria_id) values ('Coca Cola 350ML','Coca cola lata de 350ml geladinha',5.50,'https://www.google.com/url?sa=i&url=https%3A%2F%2Fmercado.carrefour.com.br%2Fcocacola-lata-350-ml-156892%2Fp&psig=AOvVaw28km98TZSRRoQJKU7RPlA9&ust=1737247582158000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNCK0tmF_ooDFQAAAAAdAAAAABAE',3);
insert into tb_produto (nome,descricao,preco,imagem,categoria_id) values ('Açai','Açai com doce de leite, uva e morango',10.00,'',4);
insert into tb_produto (nome,descricao,preco,imagem,categoria_id) values ('batata rustica','Batatinhas bem rusticas com alecrim',8.00,'https://www.google.com/url?sa=i&url=https%3A%2F%2Fbr.pinterest.com%2Fpin%2Faa-com-uva-verde-na-tigela-por-pointdoacai_pqamerica--682999099755014690%2F&psig=AOvVaw34rR6GeXB0_YPMIt5vVyEo&ust=1737247786064000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPDWi7-G_ooDFQAAAAAdAAAAABAE',2);
