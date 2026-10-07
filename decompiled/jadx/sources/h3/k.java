package h3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import app.namso_gen.spacehowen.R;
import com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4747d;

    public /* synthetic */ k(EditText editText, e0 e0Var, TextView textView, Button button) {
        this.f4744a = 1;
        this.f4745b = editText;
        this.f4746c = textView;
        this.f4747d = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f4744a;
        Object obj = this.f4747d;
        Object obj2 = this.f4746c;
        Object obj3 = this.f4745b;
        switch (i) {
            case 0:
                final n nVar = (n) obj3;
                final i3.a aVar = (i3.a) obj;
                View view2 = ((m) obj2).f10230a;
                jc.i.d(view2, "itemView");
                final Context context = view2.getContext();
                PopupMenu popupMenu = new PopupMenu(context, view2);
                popupMenu.getMenu().add(context.getString(R.string.btn_copy));
                popupMenu.getMenu().add(context.getString(R.string.btn_delete));
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: h3.l
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        String strValueOf = String.valueOf(menuItem.getTitle());
                        Context context2 = context;
                        boolean zEquals = strValueOf.equals(context2.getString(R.string.btn_copy));
                        i3.a aVar2 = aVar;
                        if (!zEquals) {
                            if (!strValueOf.equals(context2.getString(R.string.btn_delete))) {
                                return false;
                            }
                            ((c) nVar.f4781f).invoke(aVar2);
                            return true;
                        }
                        String str = aVar2.f5160c;
                        Object systemService = context2.getSystemService("clipboard");
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("historial", str));
                        Toast.makeText(context2, context2.getString(R.string.ldc_history_copied), 0).show();
                        return true;
                    }
                });
                popupMenu.show();
                break;
            case 1:
                TextView textView = (TextView) obj2;
                Button button = (Button) obj;
                Integer numY = pc.n.Y(((EditText) obj3).getText().toString());
                int iIntValue = numY != null ? numY.intValue() : 12;
                String string = "";
                for (int i10 = 0; i10 < iIntValue; i10++) {
                    StringBuilder sbB = u.e.b(string);
                    sbB.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?".charAt(kc.d.f6207b.f().nextInt(89)));
                    string = sbB.toString();
                }
                textView.setText(string);
                button.setVisibility(0);
                break;
            default:
                AuthMethodPickerActivity authMethodPickerActivity = (AuthMethodPickerActivity) obj3;
                d5.c cVar = (d5.c) obj2;
                r4.c cVar2 = (r4.c) obj;
                int i11 = AuthMethodPickerActivity.Q;
                ConnectivityManager connectivityManager = (ConnectivityManager) authMethodPickerActivity.getApplicationContext().getSystemService("connectivity");
                if (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
                    d9.j.g(authMethodPickerActivity.findViewById(android.R.id.content), authMethodPickerActivity.getString(R.string.fui_no_internet)).h();
                } else {
                    cVar.h(authMethodPickerActivity.v().f8158b, authMethodPickerActivity, cVar2.f8145a);
                }
                break;
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i) {
        this.f4744a = i;
        this.f4745b = obj;
        this.f4746c = obj2;
        this.f4747d = obj3;
    }
}
