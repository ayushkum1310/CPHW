import pandas as pd

def big_countries(world: pd.DataFrame) -> pd.DataFrame:
    sort1=world['area']>=3000000
    sort2=world['population']>=25000000    
    return world[sort1|sort2][["name","population","area"]]
