import React from "react";
import house from "../../../images/house.svg";
import styles from "./WhereAreYou.module.css";
import { Link } from "react-router-dom";

const WhereAreYou = (props) => {
  let subpages = [];

  for (let index = 0; index < props.children.length; index++) {
    subpages.push(props.children[index]);
    if (index !== props.children.length - 1) {
      subpages.push(" > ");
    }
  }

  return (
    <div className={styles["where-are-you"]}>
      <img src={house} alt="house" />
      {/* {subpages} */}
      <Link to='/'>Strona główna</Link>
    </div>
  );
};

export default WhereAreYou;
