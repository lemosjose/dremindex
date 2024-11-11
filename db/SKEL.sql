USE sonhos;

CREATE Dream(
    dreamID PRIMARY KEY IDENTITY(1,1), 
    content VARCHAR(200),
    date DATE
)
