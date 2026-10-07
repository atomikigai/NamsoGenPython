package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f3962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3963b;

    public a(b bVar, e eVar) {
        this.f3963b = bVar;
        this.f3962a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        b bVar = this.f3963b;
        DialogInterface.OnClickListener onClickListener = bVar.f3982r;
        e eVar = this.f3962a;
        onClickListener.onClick(eVar.f3994b, i);
        if (bVar.f3984t) {
            return;
        }
        eVar.f3994b.dismiss();
    }
}
