import panda as pd 
import matplotlib.pyplot as plt
import seaborn as sns
plt.style.use('ggplot')


#leitura do arquivo iris
planta = pd.read_csv("iris.csv")
planta.head()


