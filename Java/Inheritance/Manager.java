package Inheritance;

class Manager extends Employee
    {
        static double basicSalary = 65000;

        public Manager()
        {
            super();
        }

        @Override
        public long id()
        {
            return 126534;
        }

        @Override
        public String name()
        {
            return "Peter";
        }

        @Override
        public String address()
        {
            return "Chennai India";
        }

        @Override
        public long phone()
        {
            return 237844;
        }

        @Override
        public double salary()
        {
            return 65000;
        }

        @Override
        public void transportAllowance()
        {
            double transportAllowance = 15 / 100 * basicSalary;

            System.out.println(transportAllowance);
        }

        @Override
        public double calculateSalary()
        {
            return (basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100));
        }
    }