package h3;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends androidx.fragment.app.s {
    public static String b0(String str, String str2) {
        String strI = da.v.i("<strong>", str, ":</strong>");
        int length = strI.length() + pc.g.k0(str2, strI, 0, false, 6);
        if (length == -1) {
            return "";
        }
        String strSubstring = str2.substring(length);
        jc.i.d(strSubstring, "substring(...)");
        int iK0 = pc.g.k0(strSubstring, "</p>", 0, false, 6);
        if (iK0 == -1) {
            iK0 = strSubstring.length();
        }
        String strSubstring2 = strSubstring.substring(0, iK0);
        jc.i.d(strSubstring2, "substring(...)");
        return Html.fromHtml(pc.g.B0(strSubstring2).toString(), 0).toString();
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_message, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        String string;
        SimpleDateFormat simpleDateFormat;
        String str;
        jc.i.e(view, "view");
        View viewFindViewById = view.findViewById(R.id.btnBackToInbox);
        jc.i.d(viewFindViewById, "findViewById(...)");
        ((ImageButton) viewFindViewById).setOnClickListener(new com.google.android.material.datepicker.n(this, 10));
        Bundle bundle2 = this.f977f;
        String string2 = bundle2 != null ? bundle2.getString("messageContent") : null;
        View viewFindViewById2 = view.findViewById(R.id.webViewMessageContent);
        jc.i.d(viewFindViewById2, "findViewById(...)");
        WebView webView = (WebView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.textFrom);
        jc.i.d(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.textSubject);
        jc.i.d(viewFindViewById4, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.textDate);
        jc.i.d(viewFindViewById5, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById5;
        if (string2 != null) {
            String strB0 = b0("De", string2);
            String strB1 = b0("Asunto", string2);
            String strB2 = b0("Fecha", string2);
            try {
                if (pc.g.g0(strB2, '.')) {
                    simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.getDefault());
                } else {
                    simpleDateFormat = pc.g.g0(strB2, '+') ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.getDefault()) : new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
                }
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault());
                Date date = simpleDateFormat.parse(strB2);
                if (date != null && (str = simpleDateFormat2.format(date)) != null) {
                    strB2 = str;
                }
            } catch (Exception unused) {
            }
            textView.setText(w(R.string.msg_from_label, strB0));
            textView2.setText(w(R.string.msg_subject_label, strB1));
            textView3.setText(w(R.string.msg_date_label, strB2));
            WebSettings settings = webView.getSettings();
            jc.i.d(settings, "getSettings(...)");
            settings.setJavaScriptEnabled(false);
            settings.setDisplayZoomControls(true);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setDefaultFontSize(16);
            int iK0 = pc.g.k0(string2, "<strong>Cuerpo:</strong>", 0, false, 6) + 24;
            if (iK0 != -1) {
                String strSubstring = string2.substring(iK0);
                jc.i.d(strSubstring, "substring(...)");
                string = pc.g.B0(strSubstring).toString();
            } else {
                string = "";
            }
            webView.loadDataWithBaseURL(null, pc.h.W("\n                <!DOCTYPE html>\n                <html>\n                <head>\n                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n                    <style>\n                        body {\n                            font-family: Arial, sans-serif;\n                            font-size: 16px;\n                            line-height: 1.6;\n                            color: #000;\n                            background-color: transparent;\n                            padding: 16px;\n                            word-wrap: break-word;\n                        }\n                        img {\n                            max-width: 100%;\n                            height: auto;\n                        }\n                        a {\n                            color: #2196F3;\n                        }\n                    </style>\n                </head>\n                <body>\n                    " + string + "\n                </body>\n                </html>\n            "), "text/html", "UTF-8", null);
        }
    }
}
