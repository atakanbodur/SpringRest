INSERT INTO location (code, name, address)
VALUES (1, 'İstanbul Airport', 'Tayakadın, Terminal Cad No:1, 34283 Arnavutköy/İstanbul');
INSERT INTO location (code, name, address)
VALUES (2, 'İstanbul Sabiha Gökçen Airport', 'Sanayi, 34906 Pendik/İstanbul');
INSERT INTO location (code, name, address)
VALUES (3, 'Ozyegin University', 'Nisantepe, Orman Sk. No:13, 34794 Cekmekoy/İstanbul');
INSERT INTO location (code, name, address)
VALUES (4, 'Middle East Technical University', 'Üniversiteler, Dumlupınar Blv. 1/6 D:133, 06800 Çankaya/Ankara');
INSERT INTO location (code, name, address)
VALUES (5, 'Ankara Esenboga Airport', 'Balıkhisar Mh., Özal Bulvarı, Akyurt/Ankara');

insert into car_status(id, name)
values (1, 'AVAILABLE');
insert into car_status(id, name)
values (2, 'RESERVED');
insert into car_status(id, name)
values (3, 'LOANED');
insert into car_status(id, name)
values (4, 'LOST');
insert into car_status(id, name)
values (5, 'BEING_SERVICED');

insert into car_Type(id, name)
values (1, 'SUV');
insert into car_Type(id, name)
values (2, 'Economy');
insert into car_Type(id, name)
values (3, 'People Carrier');
insert into car_Type(id, name)
values (4, 'Estate');
insert into car_Type(id, name)
values (5, 'Standard');
insert into car_Type(id, name)
values (6, 'Convertible');
insert into car_Type(id, name)
values (7, 'Luxury');

insert into car(id,
                license_Num,
                barcode,
                passenger_Capacity,
                model,
                brand,
                mileage,
                transmission_Type,
                price,
                car_Type_id,
                car_Status_id)
values (1, '34 IYI 128', '5674', 5, 'XY-Z3', 'REVOULT', 112, 'AUTO', 65, 1, 1);

insert into car(id,
                license_Num,
                barcode,
                passenger_Capacity,
                model,
                brand,
                mileage,
                transmission_Type,
                price,
                car_Type_id,
                car_Status_id)
values (2, '54 DEC 056', '5589', 3, 'DAV-30', 'MEKREDES', 300, 'AUTO', 96, 7, 1);

insert into car(id,
                license_Num,
                barcode,
                passenger_Capacity,
                model,
                brand,
                mileage,
                transmission_Type,
                price,
                car_Type_id,
                car_Status_id)
values (3, '81', '0043', 8, 'LONG', 'SITROEN', 30, 'AUTO', 150, 3, 2);

insert into member(id,
                   name,
                   address,
                   email,
                   phone,
                   driv_License_Num)
values (1, 'atakan', 'istanbul', 'atakan@mozmail.com', '+905312345678', '0AB1');

insert into member(id,
                   name,
                   address,
                   email,
                   phone,
                   driv_License_Num)
values (2, 'zeynep', 'istanbul', 'zeynep@mozmail.com', '+905398765432', '03ZH04');

insert into member(id,
                   name,
                   address,
                   email,
                   phone,
                   driv_License_Num)
values (3, 'ekrem', 'istanbul', 'ekrem@mozmail.com', '+905009748596', 'Eİ');

insert into member(id,
                   name,
                   address,
                   email,
                   phone,
                   driv_License_Num)
values (4, 'tolga', 'ankara', 'tolga@mozmail.com', '+905554321212', 'TB1907');

insert into equipment(id,
                      name,
                      price)
values (1, 'Snow Tyres', 20.50);

insert into equipment(id,
                      name,
                      price)
values (2, 'Child Seat', 5.90);

insert into equipment(id,
                      name,
                      price)
values (3, 'Baby Seat', 12.50);

insert into equipment(id,
                      name,
                      price)
values (4, 'Roof Box', 34.05);

insert into equipment(id,
                      name,
                      price)
values (5, 'WIFI', 27.99);

insert into equipment(id,
                      name,
                      price)
values (6, 'GPS', 75.20);

insert into equipment(id,
                      name,
                      price)
values (7, 'Camping Supplies', 350.20);

insert into equipment(id,
                      name,
                      price)
values (8, 'Emergency Bag', 80.00);

insert into equipment(id,
                      name,
                      price)
values (9, 'Beach Gear', 120.00);

insert into service(id,
                    name,
                    price)
values (1, 'Additional Driver', 480);

insert into service(id,
                    name,
                    price)
values (2, 'Towing Service', 60);

insert into service(id,
                    name,
                    price)
values (3, 'Roadside assistance', 120);

insert into service(id,
                    name,
                    price)
values (4, 'Insurance', 150);