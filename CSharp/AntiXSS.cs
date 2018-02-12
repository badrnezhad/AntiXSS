using System;
using System.Text;
using System.Text.RegularExpressions;

namespace PC.Framework
{
  public static class AntiXSS
  {
     #region *** Antix XSS ***

        public static string AntiXSS(string input, bool disableHtmlEncoding = false, string allowRegex = "^[a-zA-Z0-9, !@#$%^&*()_+=-]*")
        {
            try
            {
                if (!Regex.IsMatch(input, allowRegex))
                    return "Dangerous Input";
                input = disableHtmlEncoding ? input : HttpUtility.HtmlEncode(input);
                return input;
            }
            catch (Exception ex)
            {
                return "Error";
            }
        }

        #endregion
  }
}
