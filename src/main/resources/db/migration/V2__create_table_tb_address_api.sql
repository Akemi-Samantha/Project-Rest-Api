CREATE TABLE IF NOT EXISTS public.tb_address_api
(
    id int generated by default as identity ,
    state varchar (255) ,
    city varchar (255),
    neighborhood varchar (255),
    zip_code varchar(255),
    number varchar (255)  ,
    additional_information varchar (255),
    main boolean ,
    customer_id int,
    CONSTRAINT tb_address_api_pkey PRIMARY KEY (id)
);

ALTER TABLE tb_address_api
ADD FOREIGN KEY (customer_id) REFERENCES tb_customer_api(id);
