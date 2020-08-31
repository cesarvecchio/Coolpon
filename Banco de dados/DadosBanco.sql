insert into [dbo].[Business] values (1,'Gabriel Vieira', '00998877-1','11-99999999','teste@email.com.br','senha');
insert into [dbo].[User] values (1,'Gabriel Vieira Rodrigues de Oliveira', '2001-12-18','11-99999999',1);
insert into [dbo].[Voucher] values (1,'money', GETDATE(),1);
insert into [dbo].[Reward] values (1,'promoção de aniversário', GETDATE(),1,1);

select * from [dbo].[Business];
select * from [dbo].[User];
select * from [dbo].[Voucher];
select * from [dbo].[Reward];