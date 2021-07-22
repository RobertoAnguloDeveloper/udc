
class Estudiante :
    def __init__(self, nombres, apellidos, tipoIdentificacion, numeroIdentificacion, email, telefono, direccion, fechaNacimiento, fechaIngreso, fechaEgreso, estado, semestre, carrera):
        self.nombres = nombres
        self.apellidos = apellidos
        self.tipoIdentificacion = tipoIdentificacion
        self.numeroIdentificacion = numeroIdentificacion
        self.email = email
        self.telefono = telefono
        self.direccion = direccion
        self.fechaNacimiento = fechaNacimiento
        self.fechaIngreso = fechaIngreso
        self.fechaEgreso = fechaEgreso
        self.estado = estado
        self.semestre = semestre
        self.carrera = carrera
    
    def getNombres(self):
        return self.nombres
    
    def getApellidos(self):
        return self.apellidos
    
    def getTipoIdentificacion(self):
        return self.tipoIdentificacion
    
    def getNumeroIdentificacion(self):
        return self.numeroIdentificacion
    
    def getEmail(self):
        return self.email
    
    def getTelefono(self):
        return self.telefono

    def getDireccion(self):
        return self.direccion

    def getFechaNacimiento(self):
        return self.fechaNacimiento

    def getFechaIngreso(self):
        return self.fechaIngreso

    def getFechaEgreso(self):
        return self.fechaEgreso

    def getEstado(self):
        return self.estado

    def getSemestre(self):
        return self.semestre

    def getCarrera(self):
        return self.carrera

    def setNombres(self, nombres):
        self.nombres = nombres

    def setApellidos(self, apellidos):
        self.apellidos = apellidos

    def setTipoIdentificacion(self, tipoIdentificacion):
        self.tipoIdentificacion = tipoIdentificacion
    
    def setNumeroIdentificacion(self, numeroIdentificacion):
        self.numeroIdentificacion = numeroIdentificacion
    
    def setEmail(self, email):
        self.email = email

    def setTelefono(self, telefono):
        self.telefono = telefono

    def setDireccion(self, direccion):
        self.direccion = direccion

    def setFechaNacimiento(self, fechaNacimiento):
        self.fechaNacimiento = fechaNacimiento

    def setFechaIngreso(self, fechaIngreso):
        self.fechaIngreso = fechaIngreso

    def setFechaEgreso(self, fechaEgreso):
        self.fechaEgreso = fechaEgreso

    def setEstado(self, estado):
        self.estado = estado

    def setSemestre(self, semestre):
        self.semestre = semestre

    def setCarrera(self, carrera):
        self.carrera = carrera

    def toString(self):
        return "Nombres: " + self.nombres + "\nApellidos: " + self.apellidos + "\nTipo de Identificacion: "+ self.tipoIdentificacion + "\nNúmero de "+ str(self.numeroIdentificacion) + "\nEmail: " + self.email + "\nTelefono: " + self.telefono + "\nDireccion: " + self.direccion + "\nFecha de nacimiento: " + self.fechaNacimiento + "\nFecha de ingreso: " + self.fechaIngreso + "\nFecha de egreso: " + self.fechaEgreso + "\nEstado: " + self.estado + "\nSemestre: " + str(self.semestre) + "\nCarrera: " + self.carrera