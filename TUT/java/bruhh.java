class bruhh{
    public static void main (String args[]){
        System.out.println ("Finding area of the room");
        room room1 = new room();
        room1.get_data(30,10);
        float area;
        area = room1.length * room1.breath;
        System.out.println ("area of the room is "+area);
        }
    }

    class room{
        float length;
        float breath;
        void get_data(float a, float b){
            length = a;
            breath = b;
        }
    }
