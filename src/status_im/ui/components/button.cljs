(ns status-im.ui.components.button
  (:require [status-im.ui.components.react :as react]
            [status-im.ui.components.colors :as colors]
            [status-im.ui.components.icons.vector-icons :as vector-icons]))

;;:type - :main, :secondary, :next , :previous
;;TODO pressed style
(defn button [{:keys [label type disabled? on-press] :or {type :main}}]
  [react/touchable-highlight {:on-press on-press :disabled disabled?}
   [react/view (merge
                (when (= type :main)
                  {:margin-vertical 8 :margin-horizontal 16})
                (cond
                  (#{:main :secondary} type)
                  {:padding-horizontal 32}
                  (= :next type)
                  {:padding-right 12 :padding-left 20}
                  (= :previous type)
                  {:padding-right 20 :padding-left 12}
                  :else nil)
                {:padding-vertical 11 :border-radius 8
                 :align-items :center :justify-content :cener
                 :background-color (cond
                                     (#{:secondary :next :previous} type)
                                     nil
                                     disabled?
                                     colors/gray-transparent-10
                                     (= type :main)
                                     colors/blue-transparent-10
                                     :else
                                     nil)})
    [react/view {:flex-direction :row :align-items :center}
     (when (= type :previous)
       [vector-icons/icon :main-icons/back {:container-style {:width 24 :height 24 :margin-right 4}
                                            :color (if disabled? colors/gray colors/blue)}])
     [react/text {:style {:color (cond
                                   disabled?
                                   colors/gray
                                   (#{:main :secondary :next :previous} type)
                                   colors/blue
                                   :else
                                   nil)}}
      label]
     (when (= type :next)
       [vector-icons/icon :main-icons/next {:container-style {:width 24 :height 24 :margin-left 4}
                                            :color (if disabled? colors/gray colors/blue)}])]]])