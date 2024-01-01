import pandas as pd

def sales_person(sales_person: pd.DataFrame, company: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    
    intermediate_merge = sales_person.merge(right=orders, how="outer", on="sales_id")

    final_merge = intermediate_merge.merge(right=company, how="left", on="com_id")

    red = final_merge[final_merge["name_y"] == "RED"][["name_x"]]

    non_red = sales_person[["name"]].merge(right=red, how="outer", left_on="name", right_on="name_x", indicator=True)

    return non_red[non_red["_merge"] == "left_only"][["name"]]
