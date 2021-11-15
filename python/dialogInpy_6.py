import tkinter as tk
from tkinter import simpledialog
ROOT=tk.Tk()
ROOT.withdraw()
var=simpledialog.askstring(title="hello!",prompt="what's your name?")
print("hello ....",var)
"""working.....
success....."""