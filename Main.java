class Main {
  public static void main(String[] args) {
   
      Alumno[] alumnos = {
      new Alumno("Juan",24),
      new Alumno("Erika",20),
      new Alumno("Emilio",23),
      new Alumno("Karina",21),
      new Alumno("Eduardo",24),
      new Alumno("Tomas",25),
    };
  System.out.println("1-Cantidad total de alumnos: " + String.valueOf(alumnos.length));

  System.out.println("2-Edad mínima de los alumnos: "+ String.valueOf(getEdadMinima(alumnos)));

  System.out.println("3-Edad máxima de los alumnos: "+String.valueOf(getEdadMaxima(alumnos)));

  System.out.println("4-Edad promedio de los alumnos: "+String.valueOf(getEdadPromedio(alumnos)));
  }
public static int getEdadMinima(Alumno[] alumnos){
  
  int edadMinima=alumnos[0].getEdad();  
  for (int i=0; i<alumnos.length; i++)
  {
    if(alumnos[i].getEdad()<edadMinima)
    {
      edadMinima=alumnos[i].getEdad();
    }
   }
  return edadMinima;
}
public static int getEdadMaxima(Alumno[] alumnos){
  int edadMaxima=-1;

  for(int i=0; i<alumnos.length; i++)
  {
    if(alumnos[i].getEdad()>edadMaxima)
    {
        edadMaxima=alumnos[i].getEdad();

    }
  }
    return edadMaxima;
}

public static int getEdadPromedio(Alumno[] alumnos)
{
  int promedio=1;
  for (int i=0; i<alumnos.length; i++)
  {
      promedio+=alumnos[i].getEdad();
      }
    promedio= promedio/(alumnos.length);
    return promedio;
}
}