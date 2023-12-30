import pandas as pd

def total_time(df: pd.DataFrame) -> pd.DataFrame:
    df['time']=df['out_time']-df['in_time']
    res=df.groupby(['emp_id','event_day'])['time'].sum().reset_index()
    res.rename(columns={'event_day':'day',"time":'total_time'},inplace=True)
    return res
