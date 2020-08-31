create table "Business" (id int primary key,
                        name varchar(45),
                         cnpj varchar(45),
                          phone varchar(45),
                           email varchar(45),
                           password varchar(45));

create table "User" (id int primary key,
                        fullName varchar(45),
                         birthDate date,
                          phone varchar(45),
                           fkBusiness int);
alter table [dbo].[User] add foreign key (fkBusiness) references [dbo].[Business](id);
create table "Voucher" (id int primary key,
                        type varchar(45),
                         createdAt DATETIME,
                          fkBusiness int);
alter table [dbo].[Voucher] add foreign key (fkBusiness) references [dbo].[Business](id);
create table "Reward" (id int primary key,
                        name varchar(45),
                         claimedAt DATETIME,
                          fkUser int,
                           fkVoucher int);                                                 
alter table [dbo].[Reward] add foreign key (fkUser) references [dbo].[User](id);
alter table [dbo].[Reward] add foreign key (fkVoucher) references [dbo].[Voucher](id);