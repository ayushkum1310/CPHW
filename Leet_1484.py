import pandas as pd

def categorize_products(activities: pd.DataFrame) -> pd.DataFrame:
    activities = activities.drop_duplicates()
    size = activities.groupby("sell_date").size().reset_index(name='num_sold')
    products = activities.groupby("sell_date")["product"].apply(lambda x: ','.join(sorted(x))).reset_index(name='products')
    result = pd.merge(size, products, on='sell_date')
    return result.rename(columns={"product": "products"}).sort_values(by="sell_date")
