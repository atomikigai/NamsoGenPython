package v0;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import da.v;
import l.a2;
import l.x2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cursor f9108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9109d;
    public a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a2 f9110f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f9111r;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f9108c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                a2 a2Var = this.f9110f;
                if (a2Var != null) {
                    cursor2.unregisterDataSetObserver(a2Var);
                }
            }
            this.f9108c = cursor;
            if (cursor != null) {
                a aVar2 = this.e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                a2 a2Var2 = this.f9110f;
                if (a2Var2 != null) {
                    cursor.registerDataSetObserver(a2Var2);
                }
                this.f9109d = cursor.getColumnIndexOrThrow("_id");
                this.f9106a = true;
                notifyDataSetChanged();
            } else {
                this.f9109d = -1;
                this.f9106a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f9106a || (cursor = this.f9108c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f9106a) {
            return null;
        }
        this.f9108c.moveToPosition(i);
        if (view == null) {
            x2 x2Var = (x2) this;
            view = x2Var.f6483u.inflate(x2Var.f6482t, viewGroup, false);
        }
        a(view, this.f9108c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f9111r == null) {
            c cVar = new c();
            cVar.f9112a = this;
            this.f9111r = cVar;
        }
        return this.f9111r;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f9106a || (cursor = this.f9108c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f9108c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f9106a && (cursor = this.f9108c) != null && cursor.moveToPosition(i)) {
            return this.f9108c.getLong(this.f9109d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f9106a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f9108c.moveToPosition(i)) {
            throw new IllegalStateException(v.f(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f9108c);
        return view;
    }
}
