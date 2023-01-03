INSERT INTO location ( name, address)
VALUES ( 'İstanbul Airport', 'Tayakadın, Terminal Cad No:1, 34283 Arnavutköy/İstanbul');
INSERT INTO location ( name, address)
VALUES ( 'İstanbul Sabiha Gökçen Airport', 'Sanayi, 34906 Pendik/İstanbul');
INSERT INTO location ( name, address)
VALUES ( 'Ozyegin University', 'Nisantepe, Orman Sk. No:13, 34794 Cekmekoy/İstanbul');
INSERT INTO location ( name, address)
VALUES ( 'Middle East Technical University', 'Üniversiteler, Dumlupınar Blv. 1/6 D:133, 06800 Çankaya/Ankara');
INSERT INTO location ( name, address)
VALUES ( 'Ankara Esenboga Airport', 'Balıkhisar Mh., Özal Bulvarı, Akyurt/Ankara');


insert into car_status( name)
values ( 'AVAILABLE');
insert into car_status( name)
values ( 'RESERVED');
insert into car_status( name)
values ( 'LOANED');
insert into car_status( name)
values ( 'LOST');
insert into car_status( name)
values ( 'BEING_SERVICED');

insert into car_Type( name)
values ( 'SUV');
insert into car_Type( name)
values ( 'Economy');
insert into car_Type( name)
values ( 'People Carrier');
insert into car_Type( name)
values ( 'Estate');
insert into car_Type( name)
values ( 'Standard');
insert into car_Type( name)
values ( 'Convertible');
insert into car_Type( name)
values ( 'Luxury');

insert into car(license_Num,
                barcode,
                passenger_Capacity,
                model,
                brand,
                mileage,
                transmission_Type,
                price,
                car_Type_id,
                car_Status_id)
values ( '34 IYI 128', '5674', 5, 'XY-Z3', 'REVOULT', 112, 'AUTO', 65, 1, 1);

insert into car(license_Num,
                barcode,
                passenger_Capacity,
                model,
                brand,
                mileage,
                transmission_Type,
                price,
                car_Type_id,
                car_Status_id)
values ( '54 DEC 056', '5589', 3, 'DAV-30', 'MEKREDES', 300, 'AUTO', 96, 7, 1);

insert into car(license_Num,
                barcode,
                passenger_Capacity,
                model,
                brand,
                mileage,
                transmission_Type,
                price,
                car_Type_id,
                car_Status_id)
values ( '81', '0043', 8, 'LONG', 'SITROEN', 30, 'AUTO', 150, 3, 2);

insert into member(name,
                   address,
                   email,
                   phone,
                   driving_License_Num)
values ( 'atakan', 'istanbul', 'atakan@mozmail.com', '+905312345678', '0AB1');

insert into member(name,
                   address,
                   email,
                   phone,
                   driving_License_Num)
values ( 'zeynep', 'istanbul', 'zeynep@mozmail.com', '+905398765432', '03ZH04');

insert into member(name,
                   address,
                   email,
                   phone,
                   driving_License_Num)
values ( 'ekrem', 'istanbul', 'ekrem@mozmail.com', '+905009748596', 'Eİ');

insert into member(name,
                   address,
                   email,
                   phone,
                   driving_License_Num)
values ( 'tolga', 'ankara', 'tolga@mozmail.com', '+905554321212', 'TB1907');

insert into equipment(name,
                      price)
values ( 'Snow Tyres', 20.50);

insert into equipment(name,
                      price)
values ( 'Child Seat', 5.90);

insert into equipment(name,
                      price)
values ( 'Baby Seat', 12.50);

insert into equipment(name,
                      price)
values ( 'Roof Box', 34.05);

insert into equipment(name,
                      price)
values ( 'WIFI', 27.99);

insert into equipment(name,
                      price)
values ( 'GPS', 75.20);

insert into equipment(name,
                      price)
values ( 'Camping Supplies', 350.20);

insert into equipment(name,
                      price)
values ( 'Emergency Bag', 80.00);

insert into equipment(name,
                      price)
values ( 'Beach Gear', 120.00);

insert into service(name,
                    price)
values ( 'Additional Driver', 480);

insert into service(name,
                    price)
values ( 'Towing Service', 60);

insert into service(name,
                    price)
values ( 'Roadside assistance', 120);

insert into service(name,
                    price)
values ( 'Insurance', 150);