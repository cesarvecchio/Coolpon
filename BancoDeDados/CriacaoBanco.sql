create table "business" (id int primary key identity,
                        name varchar(45),
                        cpf varchar(45),
                         cnpj varchar(45),
                          phone varchar(45),
                           email varchar(45),
                           password varchar(45));

create table "user" (id int primary key identity,
						cpf varchar(45),
                        phone varchar(45),
                        full_name varchar(45),
                         birth_date date,
                          fk_loyalty int,
                           fk_business int);
alter table [dbo].[user] add foreign key (fk_business) references [dbo].[business](id);
create table "voucher" (id int primary key identity,
                        cod varchar(100),
                        type varchar(45),
                         created_at DATETIME,
                          fk_business int);
alter table [dbo].[voucher] add foreign key (fk_business) references [dbo].[business](id);
create table "reward" (id int primary key identity,
                        name varchar(45),
                         claimed_at DATETIME,
                          fk_user int,
                           fk_voucher int);                                                 
alter table [dbo].[reward] add foreign key (fk_user) references [dbo].[user](id);
alter table [dbo].[reward] add foreign key (fk_voucher) references [dbo].[voucher](id);
create table "promotion" (id int primary key identity,
                        numberOfTimes int,
                         active tinyint,
                         description varchar(100),
                           fkBusiness int);    
alter table [dbo].[promotion] add foreign key (fkBusiness) references [dbo].[business](id);
create table "loyalt" (id int primary key identity,
                        number_of_times int,
                         active tinyint,
                         fk_promotion int,
                           fk_business int);
alter table [dbo].[loyalt] add foreign key (fk_business) references [dbo].[business](id);
alter table [dbo].[loyalt] add foreign key (fk_promotion) references [dbo].[promotion](id);
                           