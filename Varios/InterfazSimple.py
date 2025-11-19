import tkinter as tk
from tkinter import  messagebox

def mensaje(   ):
    messagebox.showinfo("Toma este")

ventana = tk.Tk()
ventana.title("Interfaz Simple")
ventana.geometry("300x200")
ventana.label("Arturito")
boton = tk.Button(ventana, text="Click", command=mensaje )
boton.pack()
ventana.mainloop()
