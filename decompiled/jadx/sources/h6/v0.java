package h6;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbzz;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class v0 extends t0 {
    public static final WindowInsets i(Activity activity, View view, WindowInsets windowInsets) {
        d6.p pVar = d6.p.C;
        zzbzz zzbzzVar = pVar.f2982g;
        zzbzz zzbzzVar2 = pVar.f2982g;
        if (((n0) zzbzzVar.zzi()).o() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                m0 m0VarZzi = zzbzzVar2.zzi();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    Locale locale = Locale.US;
                    String str = rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom;
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                ((n0) m0VarZzi).s(strConcat);
            } else {
                ((n0) zzbzzVar2.zzi()).s("");
            }
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (2 != attributes.layoutInDisplayCutoutMode) {
            attributes.layoutInDisplayCutoutMode = 2;
            window.setAttributes(attributes);
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    @Override // h6.a
    public final int e(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // h6.a
    public final void f(final Activity activity) {
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzbm)).booleanValue() && ((n0) d6.p.C.f2982g.zzi()).o() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: h6.u0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return v0.i(activity, view, windowInsets);
                }
            });
        }
    }
}
