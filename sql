create database MediCareDB;
use MediCareDB;
create table Doctors(DoctorID int PRIMARY KEY, DoctorName varchar(100) NOT NULL, Specialization varchar(50), ConsultationFee decimal(7,2) CHECK (ConsultationFee > 0), ExperienceYears Int CHECK (ExperienceYears >= 0));
describe Doctors;
create table Patients(PatientID int PRIMARY KEY, FirstName varchar(50) NOT NULL, LastName varchar(50), Email varchar(100) UNIQUE, RegistrationDate DATE DEFAULT(CURDATE()));
alter table Doctors add column AvailabilityStatus varchar(20) DEFAULT 'Available';
alter table Patients modify column Email varchar(255);
alter table Doctors drop column Specialization;
describe Doctors;
insert into Doctors values(301, 'Dr. Arjun Rao', 800.00, 12, 'Available'); 
insert into Doctors values(302, 'Dr. Meena Iyer', 600.00, 8, 'Available'),(303, 'Dr. Karthik Kumar', 750.00, 10, 'Unavailable');
select * from Doctors;
select * from Doctors where ConsultationFee>700;
delete from Doctors where DoctorID=301;
select * from Doctors where ExperienceYears
