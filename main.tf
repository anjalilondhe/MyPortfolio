provider "aws" {
  access_key = "AKIAZQ3DR6IUR54ATZFQ"
  secret_key = "+1nDL9HGtM4e0peqGZVcNgo3CAFGBzk1HEzKIiOX"
  region = "us-east-1"
}
resource "aws_instance" "example" {
  ami = "ami-0c7217cdde317cfec"
  instance_type = "t2.micro"
}