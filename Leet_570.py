import pandas as pd

def find_managers(df: pd.DataFrame) -> pd.DataFrame:
    new=df['managerId'].value_counts().to_frame().reset_index()
    sort=new['count']>=5
    new=new[sort]
    res=df.merge(new,left_on='id',right_on='managerId',how='left',indicator=True)
    return res[res['id']==res['managerId_y']][['name']]
