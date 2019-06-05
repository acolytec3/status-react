(ns status-im.react-native.js-dependencies
  (:require-macros [status-im.utils.js-require :as js-require]))

(def config                 (js-require/js-require "react-native-config"))
(def fs                     (js-require/js-require "react-native-fs"))
(def http-bridge            (js-require/js-require "react-native-http-bridge"))
(def keychain               (js-require/js-require "react-native-keychain"))
(def qr-code                (js-require/js-require "react-native-qrcode"))
(def react-native           (js/require "react-native"))
(def status-keycard         (js-require/js-require "react-native-status-keycard"))
(def realm                  (js/require "realm"))
(def webview-bridge         (js-require/js-require "react-native-webview-bridge"))
(def touchid-class          (js-require/js-require "react-native-touch-id"))
(defn touchid []            (.-default (touchid-class)))
(def webview                (js-require/js-require "react-native-webview"))
(def securerandom           (js-require/js-require "react-native-securerandom"))
(defn secure-random []      (.-generateSecureRandom (securerandom)))
(def fetch-polyfill         (js-require/js-require "react-native-fetch-polyfill"))
(defn fetch []              (.-default (fetch-polyfill)))
(def i18n                   (js/require "i18n-js"))
(def react-native-languages (.-default (js/require "react-native-languages")))
(def camera                 (js-require/js-require "react-native-camera"))
(def dialogs                (js-require/js-require "react-native-dialogs"))
(def dismiss-keyboard       (js-require/js-require "dismissKeyboard"))
(def image-crop-picker      (js-require/js-require "react-native-image-crop-picker"))
(def image-resizer          (js-require/js-require "react-native-image-resizer"))
(def svg                    (js/require "react-native-svg"))
(def react-native-firebase  (js-require/js-require "react-native-firebase"))
(def snoopy                 (js-require/js-require "rn-snoopy"))
(def snoopy-filter          (js-require/js-require "rn-snoopy/stream/filter"))
(def snoopy-bars            (js-require/js-require "rn-snoopy/stream/bars"))
(def snoopy-buffer          (js-require/js-require "rn-snoopy/stream/buffer"))
(def background-timer-class (js-require/js-require "react-native-background-timer"))
(defn background-timer []   (.-default (background-timer-class)))
(def react-navigation       (js/require "react-navigation"))
(def react-native-navigation-twopane  (js/require "react-native-navigation-twopane"))
(def react-native-shake     (js-require/js-require "react-native-shake"))
(def mail-class             (js-require/js-require  "react-native-mail"))
(defn react-native-mail []  (.-default (mail-class)))
(def desktop-linking        #js {:addEventListener (fn [])})
(def desktop-menu           #js {:addEventListener (fn [])})
(def desktop-config         #js {:addEventListener (fn [])})
(def desktop-shortcuts      #js {:addEventListener (fn [])})
