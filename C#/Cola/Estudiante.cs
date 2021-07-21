namespace Cola
{
    public class Estudiante
    {
        private string nombres;
        private string apellidos;
        private string tipoIdentificacion;
        private int numeroIdentificacion;
        private string email;
        private string telefono;

        private string direccion;
        private string fechaNacimiento;
        private string fechaIngreso;
        private string fechaEgreso;
        private string estado;
        private int semestre;
        private string carrera;

        public Estudiante(string nombres, string apellidos, string tipoIdentificacion, int numeroIdentificacion,
            string email, string telefono, string direccion, string fechaNacimiento, 
            string fechaIngreso, string fechaEgreso, string estado, int semestre, string carrera)
        {
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.tipoIdentificacion = tipoIdentificacion;
            this.numeroIdentificacion = numeroIdentificacion;
            this.email = email;
            this.telefono = telefono;
            this.direccion = direccion;
            this.fechaNacimiento = fechaNacimiento;
            this.fechaIngreso = fechaIngreso;
            this.fechaEgreso = fechaEgreso;
            this.estado = estado;
            this.semestre = semestre;
            this.carrera = carrera;
        }

        public string Nombres
        {
            get { return nombres; }
            set { nombres = value; }
        }

        public string Apellidos
        {
            get { return apellidos; }
            set { apellidos = value; }
        }

        public string TipoIdentificacion
        {
            get { return tipoIdentificacion; }
            set { tipoIdentificacion = value; }
        }

        public int NumeroIdentificacion
        {
            get { return numeroIdentificacion; }
            set { numeroIdentificacion = value; }
        }

        public string Email
        {
            get { return email; }
            set { email = value; }
        }

        public string Telefono
        {
            get { return telefono; }
            set { telefono = value; }
        }

        public string Direccion
        {
            get { return direccion; }
            set { direccion = value; }
        }
        
        public string FechaNacimiento
        {
            get { return fechaNacimiento; }
            set { fechaNacimiento = value; }
        }

        public string FechaIngreso
        {
            get { return fechaIngreso; }
            set { fechaIngreso = value; }
        }

        public string FechaEgreso
        {
            get { return fechaEgreso; }
            set { fechaEgreso = value; }
        }

        public string Estado
        {
            get { return estado; }
            set { estado = value; }
        }

        public int Semestre
        {
            get { return semestre; }
            set { semestre = value; }
        }

        public string Carrera
        {
            get { return carrera; }
            set { carrera = value; }
        }
        public override string ToString()
        {
            return string.Format("Nombres: {0}\nApellidos: {1}\n{2}: {3}\nCorreo electrónico: {4}\nTeléfono: {5}\nDirección: {6}\nFecha de nacimiento: {7}\nFecha de ingreso: {8}\nFecha de ingreso: {9}\nEstado: {10}\nSemestre: {11}\nCarrera: {12}"
                , nombres, apellidos, tipoIdentificacion, 
                numeroIdentificacion, email, telefono, direccion, fechaNacimiento, 
                fechaIngreso, fechaEgreso, estado, semestre, carrera);
        }
    }
}