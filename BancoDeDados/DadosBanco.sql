insert into [dbo].[Business] values ('Gabriel Vieira', '00998877-1','122.111.223-32','11-99999999','teste@email.com.br','senha');
insert into [dbo].[User] values ('122.111.223-32','11-99999999','Gabriel Vieira Rodrigues de Oliveira', '2001-12-18',1,1);
insert into [dbo].[Voucher] values ('12D312','money', GETDATE(),1);
insert into [dbo].[Reward] values ('promoção de aniversário', GETDATE(),1,1);
insert into [dbo].[Promotion] values (10,1,'teste',1);
insert into [dbo].[loyalt] values (10,1,1,1);

select * from [dbo].[Business];
select * from [dbo].[User];
select * from [dbo].[Voucher];
select * from [dbo].[Reward];