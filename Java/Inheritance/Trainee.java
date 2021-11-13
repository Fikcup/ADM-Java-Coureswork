package Inheritance;

class Trainee extends Employee
    {
        public Trainee()
        {
            super();
        }

        @Override
        public long id()
        {
            return 29846;
        }

        @Override
        public String name()
        {
            return "Jack";
        }

        @Override
        public String address()
        {
            return "Mumbai India";
        }

        @Override
        public long phone()
        {
            return 442085;
        }

        @Override
        public double salary()
        {
            return 45000;
        }
    }

