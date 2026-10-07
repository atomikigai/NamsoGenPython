package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f4113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f4114d;

    public w(View view, String str) {
        this.f4111a = view;
        this.f4112b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f4113c != null) {
            break;
        }
        View view2 = this.f4111a;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f4112b;
            if (context == null) {
                int id2 = view2.getId();
                if (id2 == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                }
                StringBuilder sbN = q1.a.n("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbN.append(view2.getClass());
                sbN.append(str);
                throw new IllegalStateException(sbN.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f4113c = method;
                    this.f4114d = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f4113c.invoke(this.f4114d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("Could not execute method for android:onClick", e4);
        }
    }
}
