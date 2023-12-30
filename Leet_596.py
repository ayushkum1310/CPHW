import pandas as pd

def find_classes(df: pd.DataFrame) -> pd.DataFrame:
    a=df['class'].value_counts().reset_index()
    return a[a['count']>=5][['class']]
