CREATE TABLE company_info (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    tagline VARCHAR(255),
    description VARCHAR(1000),
    address VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(255)
);

INSERT INTO company_info (name, tagline, description, address, email, phone) 
VALUES (
    'TechCorp Vietnam', 
    'Tiên phong giải pháp công nghệ số', 
    'Chúng tôi chuyên cung cấp các giải pháp phần mềm, chuyển đổi số toàn diện cho doanh nghiệp với hơn 10 năm kinh nghiệm dẫn đầu thị trường.', 
    'Tầng 5, Tòa nhà Công Nghệ, Quận Cầu Giấy, Hà Nội', 
    'contact@techcorp.vn', 
    '0123 456 789'
);
